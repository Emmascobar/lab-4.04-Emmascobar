
# LABORATORY 4.04 - QUESTIONS:
* ALUMNO: [Emmanuel Escobar](https://github.com/Emmascobar).

1) Did you use the same type of route to update patient information and to update an employee department?

- No. I'm used a PUT MAPPING anottation to update the patient information (model) in a general route by id.
  paciente/{id}, and in the case of employee (Doctor in my proyect) I'm used PUSH MAPPING anottation and take
  the route of department in relationship with te department parameter provide by users on body
  (employee/{department}/department).


2) Why did you choose the strategy that you chose?
- May because the patient take all parameters of a model of patient by the ID and employee only
  take a String department parameter from the DTO model.

3) What are the pros and cons of the strategies you chose for creating these routes?
- I don't know, both are useful. And they have a different specific use. Its good to know.

4) What are the tradeoffs between PUT and PATCH?
- PUT is for update all the registry of a model, while PATCH is for update a specific registry of that model.

