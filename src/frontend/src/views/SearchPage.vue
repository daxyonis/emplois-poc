<template>
  <div class="container-fluid">
    <SearchBox />
    <div class="d-flex justify-content-center pt-1">
      <h1>Search results</h1>
    </div>
    <div class="row row-cols-5 g-4">
      <div class="col" v-for="job in jobs" :key="job.id">
        <JobListing :job="job" />
      </div>
    </div>
  </div>
</template>

<script>
import SearchBox from "@/components/SearchBox.vue";
import JobListing from "@/components/JobListing.vue";
//import JobService from "@/services/JobService.js";

export default {
  name: "Search",
  components: {
    SearchBox,
    JobListing,
  },
  data() {
    return {
      jobs: null,
    };
  },
};
</script>

<style></style>
