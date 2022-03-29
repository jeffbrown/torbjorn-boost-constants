package torbjorn.boost.constants

class DemoController {
    RoleService roleService
    def index() {
        roleService.doWhatever()
        render 'Success'
    }
}
