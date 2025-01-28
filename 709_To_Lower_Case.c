char* toLowerCase(char* s) 
{
    char *str = s;

    while(*s != '\0')    
    {
        if(*s >= 'A' && *s <= 'Z')
        {
            *s = *s+32;
        }
        s++;
    }

    return str;
}