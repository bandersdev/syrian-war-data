# Creates a table for storing total casualties in the war up to
# a certain date during the war
create table if not exists total_casualties (
    id bigint not null,
    source varchar(255) not null,
    estimate_date date not null,
    estimate_low_end mediumint(6) not null,
    estimate_high_end mediumint(6) not null,
    url text not null,
    primary key(id)
);