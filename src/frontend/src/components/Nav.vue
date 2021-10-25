<template>
  <ul class="nav justify-content-end">
    <li class="nav-item">
      <router-link class="nav-link" active-class="active" to="/"
        >Home</router-link
      >
    </li>
    <li class="nav-item">
      <router-link class="nav-link" active-class="active" to="/about"
        >About</router-link
      >
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Link</a>
    </li>
    <li class="nav-item">
      <a class="nav-link disabled">Disabled</a>
    </li>
  </ul>
</template>

<script>
export default {
  name: "Nav",
};
</script>

<style></style>
