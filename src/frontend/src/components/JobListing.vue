<template>
  <div class="card" style="width: 18rem">
    <div class="card-body">
      <h5 class="card-title">{{ job.jobDescription }}</h5>
      <h6 class="card-subtitle mb-2 text-muted">{{ job.organizationName }}</h6>
      <p class="card-text">
        Lorem ipsum this is the job description blah blah blah
      </p>
    </div>
    <ul class="list-group list-group-flush">
      <li class="list-group-item">Expire le {{ job.expiryDate }}</li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "JobListing",
  props: {
    job: Object,
  },
};
</script>

<style></style>
