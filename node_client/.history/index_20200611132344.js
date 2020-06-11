const caller = require("grpc-caller");
const path = require("path");
const PROTO_PATH = path.resolve(__dirname, "./protos/csv.proto");
const client = caller("0.0.0.0:9090", PROTO_PATH, "CSV");
client.getCSVStream({}, (err, res) => {
  console.log(res);
});
