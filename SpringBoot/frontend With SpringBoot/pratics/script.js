document.getElementById("update").addEventListener("click", function () {
    const del = document.getElementById("delete");
    if (del.style.display === "block") {
        del.style.display = "none";
    } else {
        del.style.display = "block";
    }
});

function register(e){
    e.preventDefault();
    const name = document.getElementById("name").value;
    const age = document.getElementById("age").value;
    if(!name || !age){
        alert("Please Enter the both value");
        return;
    }
    fetch("http://localhost:8080/adduser",{
        method:"POST",
        headers:{
            "Content-Type" : "application/json"
        },
        body:JSON.stringify({
                name : name,
                age : parseInt(age)
            })
        })
        .then((res) => res.text())
        .then((data) => alert(data))
        .catch((err) => alert("Something went wrong"))
}
function getAllData(){
            let text = `<table border="0"><thead><tr><th>User ID</th> <th>User Name</th> <th> Age </th> </tr></thead><tbody>`;
            fetch("http://localhost:8080/getusers")
            .then((r) => r.json())
            .then((data) => {
                if(data.length == 0){
                    alert("no record found");
                    return;
                }
                for(let i=0;i<data.length;i++){
                    let id = data[i].id;
                    let name = data[i].name;
                    let age = data[i].age;

                    text += `
                        <tr>
                            <td>${id}</td>
                            <td>${name}</td>
                            <td>${age}</td>
                        </tr>
                    `;
                }
                text += `</tbody></table>`;
                document.getElementById("result").innerHTML = text
                  
            })
            .catch((err) => document.getElementById("result").innerHTML = err )
}
function updateById() {
    let id = Number(prompt("Enter User Id"));
    fetch(`http://localhost:8080/getbyid/${id}`)
    .then((r) => r.json())
    .then((data)=>{
        let userid = data.id;
        let name = prompt("Enter Name :");
        let age = prompt("Age :");
        fetch("http://localhost:8080/updateuser",{
            method : "PUT",
            headers : {
                "Content-Type" : "application/json"
            },
            body : JSON.stringify({
                id : userid,
                name : name,
                age : age
            })
        })
        .then((res) => res.text())
        .then((d) => alert(d))
        .catch((e) => alert(e))
    })
    .catch((err)=>alert("User Not Found"))
}

function deleteAll(){
    fetch("http://localhost:8080/deleteall",{
        method : "DELETE",
    })
    .then((res) => res.text())
    .then((data) => alert(data))
    .catch((err) => alert(err))
    const del = document.getElementById("delete");
    del.style.display = "none";
}
function deleteById(){
    let id = Number(prompt("Enter the id to delete records : "));
    fetch(`http://localhost:8080/deletebyid/${id}`,{
        method : "DELETE"
    })
    .then((res) => res.text())
    .then((data) => alert(data))
    .catch((err) => alert(err))

    document.getElementById("delete").style.display="none";
}