package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hm5  reason: default package */
/* loaded from: classes.dex */
public final class hm5 {
    @r06("type")
    private final b a;
    @r06("gbaRomPath")
    private final String b;
    @r06("gbaSavePath")
    private final String c;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: hm5$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: hm5$b */
    /* loaded from: classes.dex */
    public static final class b {
        private static final /* synthetic */ e12 $ENTRIES;
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
            $ENTRIES = l.C($values);
        }

        private b(String str, int i) {
        }

        public static e12 getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: hm5$c */
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

    public hm5(b bVar, String str, String str2) {
        bVar.getClass();
        this.a = bVar;
        this.b = str;
        this.c = str2;
    }

    public final me2 a() {
        Uri uri;
        int i = c.a[this.a.ordinal()];
        if (i != 1) {
            Uri uri2 = null;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return cm5.d;
                        }
                        i.c();
                        return null;
                    }
                    return em5.d;
                }
                return gm5.d;
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
            return new dm5(uri, uri2);
        }
        return fm5.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm5)) {
            return false;
        }
        hm5 hm5Var = (hm5) obj;
        if (this.a == hm5Var.a && b53.x(this.b, hm5Var.b) && b53.x(this.c, hm5Var.c)) {
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
        return b31.q(sb, str2, ")");
    }
}
