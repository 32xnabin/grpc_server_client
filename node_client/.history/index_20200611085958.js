const grpc = require("@grpc/grpc-js");
const clinet = new EchoSerive(
  "loalhost:9090",
  grpc.credentials.createInsecure()
);
client.echoUnary({ value: "hello" }, (err, response) => {
  console.log(response);
});
