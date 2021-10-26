<template>
  <div class="card h-100">
    <div class="card-body">
      <h5 class="card-title">{{ job.jobTitle }}</h5>
      <h6 class="card-subtitle mb-2 text-muted">{{ job.organizationName }}</h6>
      <p class="card-text">
        {{ job.jobDescription }}
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
