// you can write your js code here

function test(){

   // Retrieving Data
    var bookName= document.getElementById("name").value;
    var authorName=document.getElementById("author").value;
    var bookDesc=document.getElementById("desc").value;
    var addingDate=document.getElementById("added").value;
    var categry=document.getElementById("category").value;
    var bPrice= document.getElementById("price").value;

    const myObj= {

        bName:bookName,
        aName:authorName,
        bdesc:bookDesc,
        addDate:addingDate,
        cate:categry,
        price:bPrice
    }

    // //Storing Data
    localStorage.setItem("book-list",JSON.stringify(myObj));

    

    

    
}