package com.chaika

class UserController {

    def index() {
    }

    def save() {
        def user = new User(params)
        user.getClos().call(params)
        user.save()
        render(view: 'user', model: [user: user])
    }
}
