var Regex_Pattern = /^\d{1,2}[a-zA-Z]{3,}\.{0,3}$/; //Do not delete '/'. Replace __________ with your regex.

function processData(Test_String) {
    //Enter your code here

    console.log(!!Test_String.match(Regex_Pattern));
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
