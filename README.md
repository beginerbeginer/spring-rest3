# spring-rest3
Rest projects for springboot


## Swagger UIの表示方法

- ブラウザから[localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config)にアクセス


## 実際の画面

- [タスクを登録](https://gyazo.com/b9ea46e229a824f665c84170d3738f64)
- [すべてのタスクを取得](https://gyazo.com/2d74c4f75aa8976ec4adac46763130fa)


## 情報

- **springdoc-openapi**
  - OpenAPIドキュメントを、自動作成できるライブラリ
  - OpenAPIは、RESTAPIの仕様を、記述できるフォーマット。チームで開発する場合、メンバーに仕様を伝えるために、ドキュメント（API仕様）が必要になります。このドキュメントを、簡単に作成してくれるのが、springdocopenapiライブラリです。
- **SwaggerUI**
  - OpenAPIドキュメントを視覚化できるツール
  - ブラウザからAPIの仕様を確認することができる。
  - Swagger（スワッガー）は、OpenAPIの元となった仕様。
  - Swaggerが3.0になる時に、OpenAPIという名称になりました。UIやEditorなどのツール群は、Swaggerという名称のまま、ブランド化（差別化）されています。


```properties
springdoc.swaggerui.enabled=false

// SwaggerUIを使うと、値の操作ができてしまうので、リリース時は無効にします。
```




## アノテーション

- @Getter・・・get+フィールド名のコードを自動生成します。
- @Setter・・・set+フィールド名のコードを自動生成します。
- @Entity・・・データの入れ物である「エンティティ（クラス）」であることを指定します。
- @Id・・・エンティティの主キーを設定します。
- @GeneratedValue・・・主キーの値を自動採番します。@Idアノテーションと一緒に使用します。
- @NotBlank・・・文字列が、nullか空文字、空白(半角スペース)でないかを検証します。
- @Size・・・文字列の長さが、指定の範囲内かを検証します。
- @NotNull・・・nullでないかを確認する。


## アノテーション（api関連）

- @RequestMapping・・・指定のパスで、HTTPリクエストを受け付けます。
- @RequiredArgsConstructor・・・コンストラクタを自動生成します。対象は、finalなフィールドです。
- @RestController・・・このクラスが、REST用のコントローラであることを示します。
- @Operation・・・HTTPメソッドの（操作）説明を記述します。
- @RequestBody・・・HTTPリクエストのボディ部分を、引数に格納します。
- @PathVariable・・・パスの値（{}の部分）を、変数に格納します。


- @OpenAPIDefinition・・・OpenAPIの定義ができます。引数（info）を使うことで、APIの説明を記述できます。
- @Info・・・説明（メタデータ）を記述できます。
  - title・・・タイトル（TaskAPI）
  - version・・・バージョン（1.0.0）
  - description・・・説明（これは、Taskアプリケーションに関するAPIです）


## 他

- orElseGet・・・findByIdの戻り値（の型）は、Optionalです。

Optionalには、値が存在しない場合に「指定の結果を返せる」orElseGetメソッドがあります。

以下のようにすると、該当IDが存在する場合は「更新処理」。
存在しない場合は、「登録処理」を行うことができます。

```java
return repository.findById(id).map(task ->{
  //該当IDが存在する場合、更新します
  //...省略...
}).orElseGet(() -> {
  //該当IDが存在しない場合、登録します
  //...省略...
});
```




## HTTPレスポンスステータスコード

Codeは、HTTPレスポンスステータスコードです。成功した場合「2xx」が返却されます。代表的なコードには、以下があります。

- 200OK
- 201Created
- 204NoContent（返却コンテンツはないが、ヘッダーは有効）
- [HTTP レスポンスステータスコード](https://developer.mozilla.org/ja/docs/Web/HTTP/Status)




