<template>
  <div class="d-flex justify-content-center pt-1">
    <h1>Rechercher un emploi</h1>
  </div>
  <div class="d-flex justify-content-center p-3">
    <div class="row">
      <div class="col">
        <input
          type="text"
          class="form-control"
          placeholder="Poste recherché"
          aria-label="Poste recherché"
        />
      </div>
      <div class="col">
        <input
          type="text"
          class="form-control"
          placeholder="Montréal, QC"
          aria-label="Lieu"
        />
      </div>
      <div class="col">
        <button type="submit" class="btn btn-primary">Trouver</button>
      </div>
    </div>
  </div>
</template>
<script>
export default {};
</script>
