const caller = require("grpc-caller");
const path = require("path");
const PROTO_PATH = path.resolve(__dirname, "./protos/user.proto");
const client = caller("0.0.0.0:9090", PROTO_PATH, "user");
client.login({ username: "1", password: "1" }, (err, res) => {
  console.log(res);
});
