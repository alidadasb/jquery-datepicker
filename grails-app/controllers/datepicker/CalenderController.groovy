package datepicker

class CalenderController {

    def save() {
        new Calender(params).save(flush:true)
        render "Result save in database:   " + Calender.list()
    }
}
