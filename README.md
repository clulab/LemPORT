# What is it?

This is the [CLU Lab](clulab.org)'s fork of [LemPort](https://github.com/rikarudo/LemPORT), a lemmatizer for Portuguese, modified to build with [`sbt` 1.x](https://www.scala-sbt.org/download.html) and work with the [Universal POS tagset](http://universaldependencies.org/u/pos/all.html).

# Citations

If you use `LemPORT` in your project, please cite the following work:

```
@InProceedings{rodrigues_et_al:OASIcs:2014:4575,
  author ={Ricardo Rodrigues and Hugo Gon{\c{c}}alo Oliveira and Paulo Gomes},
  title ={{LemPORT: a High-Accuracy Cross-Platform Lemmatizer for Portuguese}},
  booktitle ={3rd Symposium on Languages, Applications and Technologies},
  pages ={267--274},
  series ={OpenAccess Series in Informatics (OASIcs)},
  ISBN ={978-3-939897-68-2},
  ISSN ={2190-6807},
  year ={2014},
  volume ={38},
  editor ={Maria Jo{\~a}o Varanda Pereira and Jos{\'e} Paulo Leal and Alberto Sim{\~o}es},
  publisher ={Schloss Dagstuhl--Leibniz-Zentrum fuer Informatik},
  address ={Dagstuhl, Germany},
  URL ={http://drops.dagstuhl.de/opus/volltexte/2014/4575},
  URN ={urn:nbn:de:0030-drops-45753},
  doi ={10.4230/OASIcs.SLATE.2014.267},
  annote ={Keywords: lemmatization, normalization, rules, lexicon}
}
```

# Changes
[Please see the CHANGES file](CHANGES.md)


# Use

## Compilation

```
sbt compile
```

## Releases

Releases of this fork are published to the [Sonatype](https://search.maven.org/) Central Maven repository:

- https://search.maven.org/artifact/org.clulab/lemport

If using `sbt`, add the following entry to your `libraryDependencies` (replace `"x.y.z"` with your selected version):

```
"org.clulab" % "lemport" % "x.y.z"
```

## Building a fat `jar`

```
sbt assembly
```
