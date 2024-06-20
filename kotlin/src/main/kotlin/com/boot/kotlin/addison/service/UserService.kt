package com.boot.kotlin.addison.service

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpSession

class UserService {

    fun test(request: HttpServletRequest) {
        request.getSession()

    }
}
