
# LABORATORY 4.04 - QUESTIONS:
* Student: [Emmanuel Escobar](https://github.com/Emmascobar).
-------------------------------------------------------------

1) Did you use the same type of route to update patient information and to update an employee department?
- No. I'm used a PUT MAPPING verb anottation to update all the patient information (model) in a general route by id - (paciente/{id}), and in the case of employee (Doctor in my proyect) I'm used PUSH MAPPING anottation and take the route of department in relationship with te department parameter provide by users on body - (employee/{department}/department).


2) Why did you choose the strategy that you chose?
- Because REST ANNOTATIONS provides a easyly way to defined the routes and update an specific resource. In this case the patient take all parameters of a model of patient by the ID and employee only take a String department parameter from the DTO model.

3) What are the pros and cons of the strategies you chose for creating these routes?
- Differing HTTP name methods, like GET, PUT, PATCH & DELETE, can be used on any endpoint which map to application create, read, update, and delete. RESTful APIs are written for consumers. The name and structure of URIs whit resource naming convenion should convey meaning to those consumers. It's often difficult to know what the data boundaries should be, but with understanding of your data, you most-likely are equipped to take a stab and what makes sense to return as a representation to your clients and another devs.

4) What are the tradeoffs between PUT and PATCH?
- PUT is used for update all the registry of a Database model, while PATCH is used for update a specific registry of that model.

