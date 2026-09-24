# cloud-itonami-assoc-9411-pry-uip

Industry rule/history catalog for the **Unión Industrial Paraguaya**
(UIP) — the TWENTY-SIXTH entry aligned to **ISIC 9411** (activities of
business, employers, and professional membership organizations),
alongside
[`-9411-sau-fsc`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-sau-fsc)
(Saudi Arabia),
[`-9411-aut-wko`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-aut-wko)
(Austria),
[`-9411-irl-ibec`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-irl-ibec)
(Ireland),
[`-9411-nzl-businessnz`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-nzl-businessnz)
(New Zealand),
[`-9411-cze-spcr`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-cze-spcr)
(Czech Republic),
[`-9411-ind-cii`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-ind-cii)
(India),
[`-9411-zaf-busa`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-zaf-busa)
(South Africa),
[`-9411-bra-cni`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-bra-cni)
(Brazil),
[`-9411-ken-kam`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-ken-kam)
(Kenya),
[`-9411-can-chamber`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-can-chamber)
(Canada),
[`-9411-mex-coparmex`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-mex-coparmex)
(Mexico),
[`-9411-ita-confindustria`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-ita-confindustria)
(Italy),
[`-9411-nld-vnoncw`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-nld-vnoncw)
(Netherlands),
[`-9411-kor-kcci`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-kor-kcci)
(South Korea),
[`-9411-arg-uia`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-arg-uia)
(Argentina),
[`-9411-bel-feb`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-bel-feb)
(Belgium),
[`-9411-dnk-di`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-dnk-di)
(Denmark),
[`-9411-swe-sn`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-swe-sn)
(Sweden),
[`-9411-fin-ek`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-fin-ek)
(Finland),
[`-9411-tha-fti`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-tha-fti)
(Thailand),
[`-9411-chl-sofofa`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-chl-sofofa)
(Chile),
[`-9411-col-andi`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-col-andi)
(Colombia),
[`-9411-cri-uccaep`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-cri-uccaep)
(Costa Rica),
[`-9411-ecu-cip`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-ecu-cip)
(Ecuador), and
[`-9411-egy-fei`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-egy-fei)
(Egypt). Part of the
[`cloud-itonami`](https://github.com/cloud-itonami) compliance-fact
family (ADR-2607141700, `cloud-itonami-compliance-fact-federation`,
in `com-junkawasaki/root`).

## Sourcing note

This repo fills Paraguay's previously-open association-axis gap (one
of the 2-country gap list recorded at tick 160). Paraguay now has
real, individually verified facts across all three axes: country
([`cloud-itonami-iso3166-pry`](https://github.com/cloud-itonami/cloud-itonami-iso3166-pry)),
municipality
([`cloud-itonami-municipality-pry-asuncion`](https://github.com/cloud-itonami/cloud-itonami-municipality-pry-asuncion)),
and association (this repo).

Every entry cites a page or document UIP itself serves from
`uip.org.py`, with the verbatim Spanish span it rests on
(`:source-quote`) and where in the source it is (`:source-article`):

- the **Institucional** page (mission, vision, values, strategic axes,
  the dated history timeline, branches) and the **Historia** page;
- the **Estatuto** (Statute) PDF linked under "Instrumentos
  Reguladores" -- Art. 1 (founded 20 Setiembre 1936, Decree 7197),
  aims, membership, authorities, President's term, Tribunal de Honor,
  dissolution, and the closing approval note (20/IX/1936; current
  reforms 25/I/2022, Decree 8953 of 13/III/2023);
- the **Código de Conducta** (approved by the Consejo Directivo on
  17 December 2019), the **Política de Calidad** (ISO 9001:2015) and
  the **Política de Comunicación** (approved 10 December 2024);
- service and committee pages (Certificaciones, CEE, UIP Joven,
  Comisión de Damas, No al Trabajo Infantil, Fundación Industrial,
  Centro Mi Pyme Cumple) and the 90th-anniversary news post
  (17/09/2026).

Two of UIP's own pages disagree on when the "No al Trabajo Infantil"
drawing contest began (Comisión de Damas: 2013; the contest page:
"Desde 2016"). Both are recorded, each as its page states it, and each
title names the other; neither is chosen.

The Historia page's founding sentence reads "El 20 de setiembre del
mismo" -- no year -- so the 1936-09-20 founding is cited from the
Institucional page and the Statute instead, which both name the year.
`https://uip.org.py/institucional/historia/` (the July citation)
now redirects to `https://uip.org.py/historia/`, which is cited
directly.

No Wikidata entry exists for UIP (search returned "no results
matching the query" in July) -- noted transparently. No personal names
of office-holders are persisted; the quotes stop before each name and
`test/association/facts_test.kotoba` pins that they still do.

## Scope

A **read-only reference/archive** catalog -- not an Advisor⊣Governor
actuation actor. It proposes or executes nothing on UIP's behalf.

Coverage is reported honestly (see `association.facts/coverage`): an
association not in `catalog` has **no spec-basis**, full stop -- never
fabricate one.

## Data

- `data/datascript-tx.edn` -- the catalog, source of truth. Facts are
  authored here and nowhere else.
- `src/association/facts.kotoba` (Clojure reading) and
  `src/association_facts.kotoba` (Kotoba port) -- both GENERATED from
  the data file by `scripts/gen-kotoba-port.cljk`. Do not hand-edit.
- `schema/association-rule.edn` -- DataScript schema.

## Verify

```sh
kbb --backend sci scripts/gen-kotoba-port.cljk --check    # both readings match the data file
kbb --backend sci scripts/verify-catalog.cljk             # structural, offline
kbb --backend sci scripts/verify-catalog.cljk --live      # fetch every :url, require every quote
```

`verify-catalog` exits 0 (checked, nothing wrong), 1 (findings printed)
or 2 (refused: could not read the catalog or a source -- neither a pass
nor a finding). `--live` needs `curl` and `pdftotext` on PATH, prints
`FETCHED n/n`, and prints a `CONTROL` line for a path that cannot exist
on `uip.org.py` so that a soft-404 fallback page is detected rather
than read as support.

## License

AGPL-3.0-or-later (matches the `cloud-itonami-iso3166-*` /
`-municipality-*` / `-assoc-*` / `-lei-*` convention). Policy text
itself remains UIP's; this repo stores only citation metadata
(id/title/url/dates), not full text.
