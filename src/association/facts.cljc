(ns association.facts
  "Industry rule/history catalog for the Unión Industrial Paraguaya
  (UIP) -- a 68th industry-association-level source (see
  cloud-itonami-assoc-9411-sau-fsc, -9411-aut-wko, -9411-irl-ibec,
  -9411-nzl-businessnz, -9411-cze-spcr, -9411-ind-cii, -9411-zaf-busa,
  -9411-bra-cni, -9411-ken-kam, -9411-can-chamber, -9411-mex-coparmex,
  -9411-ita-confindustria, -9411-nld-vnoncw, -9411-kor-kcci,
  -9411-arg-uia, -9411-bel-feb, -9411-dnk-di, -9411-swe-sn, -9411-fin-ek,
  -9411-tha-fti, -9411-chl-sofofa, -9411-col-andi, -9411-cri-uccaep,
  -9411-ecu-cip, -9411-egy-fei for the first twenty-five) per
  ADR-2607141700 (cloud-itonami-compliance-fact-federation). The
  TWENTY-SIXTH entry aligned to ISIC 9411 (activities of business,
  employers, and professional membership organizations). Fills
  Paraguay's previously-open association-axis gap (one of the
  2-country gap list recorded at tick 160) -- Paraguay now has real,
  individually verified facts across ALL THREE axes (country:
  cloud-itonami-iso3166-pry statute.facts; municipality:
  cloud-itonami-municipality-pry-asuncion; association: this entry).

  Both entries here are directly WebFetch-verified against UIP's own
  official 'Historia' page (https://uip.org.py/institucional/historia/),
  which renders successfully and gives precisely dated quotes: 'Al
  fin, el 8 de julio de 1936 se reunían en el Banco de la República,
  los propietarios y representantes de 55 industrias' (owners and
  representatives of 55 industries met at the Banco de la República
  on 8 July 1936) and 'El 20 de setiembre del mismo se iniciaba una
  larga asamblea que concluiría con la constitución definitiva de la
  Unión Industrial Paraguaya y la aceptación plena de sus estatutos
  sociales' (a lengthy assembly beginning 20 September 1936 concluded
  with UIP's definitive constitution and full acceptance of its
  bylaws). No Wikidata entry exists for UIP at all (search returned
  'no results matching the query') -- noted transparently rather
  than treated as a gap needing to be filled elsewhere. No personal
  names of office-holders are persisted here.

  An association not in `catalog` has NO spec-basis, full stop; never
  fabricate one.")

(def catalog
  "association-slug -> vector of association-rule entries."
  {"uip"
   [{:association-rule/id "uip.initial-meeting-1936-07-08"
     :association-rule/title "Owners and representatives of 55 industries met at the Banco de la República on 8 July 1936, the initial step toward founding UIP (UIP's own official 'Historia' page)"
     :association-rule/association "uip"
     :association-rule/isic "9411"
     :association-rule/country "PRY"
     :association-rule/kind :governance-program
     :association-rule/url "https://uip.org.py/institucional/historia/"
     :association-rule/url-provenance :official-uip-org-py
     :association-rule/established-date "1936-07-08"
     :association-rule/retrieved-at "2026-07-18"
     :association-rule/topic #{:governance}}
    {:association-rule/id "uip.founding-1936-09-20"
     :association-rule/title "The Unión Industrial Paraguaya (UIP) was definitively constituted on 20 September 1936, following a lengthy assembly with full acceptance of its bylaws (UIP's own official 'Historia' page)"
     :association-rule/association "uip"
     :association-rule/isic "9411"
     :association-rule/country "PRY"
     :association-rule/kind :governance-program
     :association-rule/url "https://uip.org.py/institucional/historia/"
     :association-rule/url-provenance :official-uip-org-py
     :association-rule/established-date "1936-09-20"
     :association-rule/retrieved-at "2026-07-18"
     :association-rule/topic #{:governance}}]})

(defn spec-basis [association] (get catalog association))

(defn coverage
  ([] (coverage (keys catalog)))
  ([associations]
   (let [have (filter catalog associations)
         missing (remove catalog associations)]
     {:requested (count associations)
      :covered (count have)
      :covered-associations (vec (sort have))
      :missing-associations (vec (sort missing))
      :note (str "cloud-itonami-assoc-9411-pry-uip Wave 0 (ADR-2607141700): "
                 (count (get catalog "uip")) " UIP entries seeded "
                 "with UIP's own official Historia page (no Wikidata entry exists for UIP at all). "
                 "Extend `association.facts/catalog`, never fabricate an id/url.")})))

(defn by-topic [association topic]
  (filterv #(contains? (:association-rule/topic %) topic) (spec-basis association)))
