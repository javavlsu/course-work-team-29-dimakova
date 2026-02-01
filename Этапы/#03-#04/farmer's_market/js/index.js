const cont = document.querySelector(`.cards-container`);

for (let i = 0; i < 8; i++) {
  cont.innerHTML += `<div class="card">
          <img src="assets/jam.png" alt="Фото товара" />
          <div class="info">
            <div class="card-info-item">300 ₽</div>
            <div class="card-info-item">
              <img src="assets/icons/star.svg" alt="Иконка звезды" /> 4.8
            </div>
          </div>
          <a href="product.html">
            <h3 class="card-header">Варенье кабачковое с лимоном</h3>
          </a>
          <div class="card-btn-container">
            <div>
              <button class="card-btn">В корзину</button>
            </div>
          </div>
        </div>`;
  cont.innerHTML += `        <div class="card">
          <img src="assets/yogurt.png" alt="Фото товара" />
          <div class="info">
            <div class="card-info-item">100 ₽</div>
            <div class="card-info-item">
              <img src="assets/icons/star.svg" alt="Иконка звезды" /> 5.0
            </div>
          </div>
          <a href="product.html">
            <h3 class="card-header">Йогурт питьевой малиновый</h3>
          </a>
          <div class="card-btn-container">
            <button class="card-btn-small">-</button>
            <span class="count">1 шт.</span>
            <button class="card-btn-small">+</button>
          </div>
        </div>`;
}
