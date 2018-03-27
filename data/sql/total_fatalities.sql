# Creates a table for storing total fatalities in the war up to
# a certain date during the war
create table if not exists total_fatalities (
    id bigint not null,
    source varchar(255) not null,
    estimate_date date not null,
    estimate_low_end mediumint(6) not null,
    estimate_high_end mediumint(6) not null,
    url text not null,
    primary key(id)
);

insert into total_fatalities (id, source, estimate_date, estimate_low_end, estimate_high_end, url)
values (591958079,
        'Syrian Observatory for Human Rights (SOHR)',
        '2018-03-03',
        511000,
        511000,
        'http://www.syriahr.com/en/?p=86573');

insert into total_fatalities (id, source, estimate_date, estimate_low_end, estimate_high_end, url)
values (609979569,
        'Syrian Center for Policy Research (SCPR)',
        '2016-02-11',
        470000,
        470000,
        'http://scpr-syria.org/publications/policy-reports/confronting-fragmentation/');

insert into total_fatalities (id, source, estimate_date, estimate_low_end, estimate_high_end, url)
values (665645356,
        'Violations Documentation Centre (VDC)',
        '2018-03-24',
        161000,
        161000,
        'http://www.vdc-sy.info/index.php/en/martyrs');

insert into total_fatalities (id, source, estimate_date, estimate_low_end, estimate_high_end, url)
values (332870702,
        'United Nations and Arab League Special Envoy to Syria',
        '2016-04-23',
        400000,
        400000,
        'https://www.aljazeera.com/news/2016/04/staffan-de-mistura-400000-killed-syria-civil-war-160423055735629.html');