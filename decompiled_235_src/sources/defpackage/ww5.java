package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ww5  reason: default package */
/* loaded from: classes.dex */
public final class ww5 {
    @gc6("type")
    private final b a;
    @gc6("gbaRomPath")
    private final String b;
    @gc6("gbaSavePath")
    private final String c;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: ww5$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: ww5$b */
    /* loaded from: classes.dex */
    public static final class b {
        private static final /* synthetic */ t52 $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b None = new b("None", 0);
        public static final b GbaRom = new b("GbaRom", 1);
        public static final b RumblePak = new b("RumblePak", 2);
        public static final b MemoryExpansion = new b("MemoryExpansion", 3);
        public static final b AnalogInput = new b("AnalogInput", 4);

        private static final /* synthetic */ b[] $values() {
            return new b[]{None, GbaRom, RumblePak, MemoryExpansion, AnalogInput};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nc1.L($values);
        }

        private b(String str, int i) {
        }

        public static t52 getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: ww5$c */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.GbaRom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.RumblePak.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.MemoryExpansion.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.AnalogInput.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public ww5(b bVar, String str, String str2) {
        bVar.getClass();
        this.a = bVar;
        this.b = str;
        this.c = str2;
    }

    public final hi2 a() {
        Uri uri;
        int i = c.a[this.a.ordinal()];
        if (i != 1) {
            Uri uri2 = null;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return rw5.o;
                        }
                        i.d();
                        return null;
                    }
                    return tw5.o;
                }
                return vw5.o;
            }
            String str = this.b;
            if (str != null) {
                uri = Uri.parse(str);
            } else {
                uri = null;
            }
            String str2 = this.c;
            if (str2 != null) {
                uri2 = Uri.parse(str2);
            }
            return new sw5(uri, uri2);
        }
        return uw5.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww5)) {
            return false;
        }
        ww5 ww5Var = (ww5) obj;
        if (this.a == ww5Var.a && nb3.k(this.b, ww5Var.b) && nb3.k(this.c, ww5Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        b bVar = this.a;
        String str = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder("RomGbaSlotConfigDto(type=");
        sb.append(bVar);
        sb.append(", gbaRomPath=");
        sb.append(str);
        sb.append(", gbaSavePath=");
        return i61.n(sb, str2, ")");
    }
}
