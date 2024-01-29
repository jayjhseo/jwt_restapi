<script>
    import { onMount } from 'svelte';
  
    let testElement;
  
    onMount(() => {
      // 1번
      testElement.style.color = 'red';
  
      // 2번
      testElement.addEventListener('click', function() {
        this.style.color = 'blue';
      });
    });
  </script>
  
  <ul class="tab-menu-box">
    <li>
        <a href="#tab-1">메뉴1</a>
    </li>
    <li>
        <a href="#tab-1">메뉴1</a>
    </li>
  </ul>