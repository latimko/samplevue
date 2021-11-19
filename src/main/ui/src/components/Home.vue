<template>
  <div class="hello">
    <Header />
    <div class="container mrgnbtm">
          <div class="row">
            <div class="col-md-8">
                <h2> Hi There </h2>
            </div>
          </div>
    </div>
  </div>
</template>
<script>
import Header from './Header.vue'

export default {
	name: 'Home',
	components: {Header}
}
</script>
