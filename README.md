# Java

* [Eclipse - Qiita](http://qiita.com/tags/eclipse)

## やっておくべき初期設定

* Mac版EclipseにPleiadesを適用する
	* [MacのEclipse をPleiadesで日本語化する](http://supportdoc.net/support-general/pleiades-mac.html)
* 最新のJavaをEclipseに適用
    * デフォルトの状態ではMac標準のJREが使用されるので、Oracleから落としてきた最新のJRE(JDK)を使用する。
    * [Eclise]->[環境設定]->[Java]->[インストール済みのJRE]を開く
    * [追加]->[標準VM]を開き、JREホームに`/Library/Java/JavaVirtualMachines/%JDKバージョン%.jdk/Contents/Home`を指定する
* テーマを変える
	* http://eclipse-color-theme.github.com/update をソフトウェア更新で指定する
	* エディタ部分が黒くなればよしとする
* Eclipse設定
	* タブをスペース4にする
	* 左メニューにナビゲータを出す
	* 下メニューに検索、コンソールを出す
	* Spotlight検索とコンテンツアシスト(コード補完)のキーバインドが被っている場合は変更
	* 次のタブ、前のタブ

## Eclipseプラグイン
* CheckStyle
	* http://sevntu-checkstyle.github.com/sevntu.checkstyle/update-site/
* JDEclipse-Realign
	* デコンパイルツール
		* JD-EclipseやJadclipseは古いので使えない
	* http://d.hatena.ne.jp/anagotan/20130725/1374720657




