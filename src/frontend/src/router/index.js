import { createRouter, createWebHistory } from "vue-router";
import Home from "../views/HomePage.vue";
import Search from "../views/SearchPage.vue";

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },
  {
    path: "/search",
    name: "Search",
    component: Search,
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
