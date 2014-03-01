package datepicker

class CalenderController {

    def save(Date endDate) {
        new Calender(endDate:endDate).save(flush:true,failOnError: true)
        render "Result save in database:   " + Calender.list()
    }
}
