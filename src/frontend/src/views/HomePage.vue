<template>
  <div class="container-fluid">
    <Search />
    <div class="row">
      <div class="col text-center p-4">
        <h2>Emplois récents</h2>
      </div>
    </div>
    <div class="row row-cols-5 g-4">
      <div class="col" v-for="job in jobs" :key="job.id">
        <JobListing :job="job" />
      </div>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
import Search from "@/components/Search.vue";
import JobListing from "@/components/JobListing.vue";
import JobService from "@/services/JobService.js";

export default {
  name: "Home",
  components: {
    Search,
    JobListing,
  },
  data() {
    return {
      jobs: null,
    };
  },

  created() {
    JobService.getJobs()
      .then((response) => {
        this.jobs = response.data;
      })
      .catch((error) => {
        console.log(error);
      });
  },
};
</script>
