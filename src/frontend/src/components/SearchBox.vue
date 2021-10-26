<template>
  <div class="d-flex justify-content-center pt-1">
    <h1>Rechercher un emploi</h1>
  </div>
  <div class="d-flex justify-content-center p-3">
    <form class="row" @submit.prevent="find">
      <div class="col">
        <input
          type="text"
          class="form-control"
          placeholder="Poste recherché"
          aria-label="Poste recherché"
          v-model="position"
        />
      </div>
      <div class="col">
        <input
          type="text"
          class="form-control"
          placeholder="Montréal, QC"
          aria-label="Lieu"
          v-model="location"
        />
      </div>
      <div class="col">
        <button type="submit" class="btn btn-primary">Trouver</button>
      </div>
    </form>
  </div>
</template>
<script>
import router from "@/router";

export default {
  data() {
    return {
      position: "",
      location: "Montreal",
    };
  },

  methods: {
    find() {
      console.log(`Position= ${this.position}, location=${this.location}`);
      router.push({
        path: "/search",
        query: { location: this.location, position: this.position },
      });
    },
  },
};
</script>
