provider "heroku" {
  email = "${var.heroku_email}"
  api_key = "${var.api_key}"
  version = "1.6"
}

resource "heroku_app" "default" {
  name = "${var.app_name}"
  region = "${var.region}"
}
