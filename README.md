# TaskQ
Queue editable tasks to run at a particular time and date. 

Most Scheduling tasks are non-editable(Spring and RabbitMQ). TaskQ aims to create tasks which are editable.

I have found the use case in one of our projects. We wanted to schedule tasks for warehouses at their end time in a day. But these end times are subjected to change by business needs and hence the task needs to be edited.
To achieve this use-case, I started working on TaskQ.

The project is a work in progress.
