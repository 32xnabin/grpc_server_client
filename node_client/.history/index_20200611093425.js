const caller = require("grpc-caller");
const PROTO_PATH = path.resolve(__dirname, "./protos/user.proto");
const client = caller("0.0.0.0:9090", PROTO_PATH, "Greeter");
client.sayHello({ name: "Bob" }, (err, res) => {
  console.log(res);
});
