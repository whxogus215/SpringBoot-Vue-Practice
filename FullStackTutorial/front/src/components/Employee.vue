<template>
    <div class="container">
        <h1 class="text-center">Employees List</h1>
        <table class="table table-striped">
            <thead>
                <th> Employee Id </th>
                <th> Employee First Name </th>
                <th> Employee Last Name </th>
                <th> Employee Email </th>
            </thead>
            <tbody>
                <tr v-for="employee in employees" v-bind:key="employee.id">
                    <td>  {{employee.id}}  </td>
                    <td>  {{employee.firstName}}  </td>
                    <td>  {{employee.lastName}}  </td>
                    <td>  {{employee.email}}  </td>
                </tr>
            </tbody>
        </table>

    </div>
</template>

<script>
import EmployeeService from '@/services/EmployeeService'
    export default {
        name: 'Employees',
        data(){
            return {
                employees : []
            }
        },
        methods: {
            getEmployees(){
                EmployeeService.getEmployees().then((response) => {
                    this.employees = response.data;
                });
            }
        },
        created() {
            this.getEmployees()
        },
    }
</script>

<!-- 부트스트랩 CSS를 사용할 것이기 때문에 따로 Style 태그를 사용하지 않음 -->
