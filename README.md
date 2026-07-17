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

Both entries here are directly WebFetch-verified against `uip.org.py`'s
own official "Historia" page, which renders successfully and gives
precisely dated quotes — no fallback needed. No Wikidata entry exists
for UIP at all (search returned "no results matching the query") —
noted transparently.

## Scope

A **read-only reference/archive** catalog — not an Advisor⊣Governor
actuation actor. It proposes or executes nothing on UIP's behalf.

Coverage is reported honestly (see `association.facts/coverage`): an
association not in `catalog` has **no spec-basis**, full stop — never
fabricate one.

## Data

- `src/association/facts.cljc` — the catalog, source of truth.
- `schema/association-rule.edn` — DataScript schema.
- `data/datascript-tx.edn` — derived DataScript tx-data (query this
  alongside other `cloud-itonami`/`etzhayyim` compliance-fact sources via
  `com-junkawasaki/root`'s `scripts/compliance-fact-query.cljs`).

Both entries directly WebFetch-verified against UIP's own Historia
page: owners and representatives of 55 industries meeting at the
Banco de la República on 8 July 1936, and UIP's definitive
constitution on 20 September 1936 following a lengthy assembly.

## License

AGPL-3.0-or-later (matches the `cloud-itonami-iso3166-*` /
`-municipality-*` / `-assoc-*` / `-lei-*` convention). Policy text
itself remains UIP's; this repo stores only citation metadata
(id/title/url/dates), not full text.
