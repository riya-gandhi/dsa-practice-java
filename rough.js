let str = "string"

let charArr = str.split("");
let arr = [];

// reverse.forEach((element) => {
//     arr.push(element);
// });

let ans = "";

for(let i = charArr.length-1;i>=0;i++){
    ans += charArr[i];
}

