package jahspotify.media;

/**
 * @author Johan Lindquist
 */
public enum AlbumType
{
    ALBUM, SINGLE, COMPILATION, UNKNOWN;

    public static AlbumType fromOrdinal(int ordinal)
    {
        return AlbumType.values()[ordinal];
    }

}