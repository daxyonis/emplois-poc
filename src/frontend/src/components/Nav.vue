<template>
  <ul class="nav justify-content-end">
    <li class="nav-item">
      <router-link class="nav-link" active-class="active" to="/"
        >Accueil</router-link
      >
    </li>
    <li class="nav-item">
      <router-link class="nav-link" active-class="active" to="/search"
        >A Propos</router-link
      >
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Link</a>
    </li>
  </ul>
</template>

<script>
export default {
  name: "Nav",
};
</script>

<style></style>
