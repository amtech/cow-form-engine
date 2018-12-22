一、数据库设计
表：front_style_info
id,created_by,create_date,updated_by,updated_date,is_deleted,biz_code,page_code,page_type,page_desc,template,is_start,page_style

表：table_relation_info
id,created_by,create_date,updated_by,updated_date,is_deleted,biz_code,table_name,parent_table_name,java_class_name,java_class_path

表：column_info
id,created_by,create_date,updated_by,updated_date,is_deleted,code,table_name,column_name,column_type,column_length,is_null,is_enable

表：column_common_config
id,created_by,create_date,updated_by,updated_date,is_deleted,code,length,regular,is_query,query_type,query_ext_field,is_visible,is_null

表：column_back_config
id,created_by,create_date,updated_by,updated_date,is_deleted,code,java_field_name,java_type,output_type,output_range,output_format

表：column_front_config
id,created_by,create_date,updated_by,updated_date,is_deleted,code,view_type,input_type,input_range,input_rely_on,cn_name

表：column_rule_config
id,created_by,create_date,updated_by,updated_date,is_deleted,code,rule,sort
