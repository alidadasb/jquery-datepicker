package datepicker



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class CalenderController {

    @Transactional
    def save(Date endDate) {

        new Calender(endDate:endDate).save flush:true, failOnError: true

        render "Result: "+ Calender.list()

    }




}
