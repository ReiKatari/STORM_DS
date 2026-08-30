package of;

import af.d;
import af.e;
import android.net.Uri;
import m9.o;
import nc.k;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {
    @va.b("type")

    /* renamed from: a  reason: collision with root package name */
    private final b f10982a;
    @va.b("gbaRomPath")

    /* renamed from: b  reason: collision with root package name */
    private final String f10983b;
    @va.b("gbaSavePath")

    /* renamed from: c  reason: collision with root package name */
    private final String f10984c;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class b {
        private static final /* synthetic */ fc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b None = new b("None", 0);
        public static final b GbaRom = new b("GbaRom", 1);
        public static final b RumblePak = new b("RumblePak", 2);
        public static final b MemoryExpansion = new b("MemoryExpansion", 3);

        private static final /* synthetic */ b[] $values() {
            return new b[]{None, GbaRom, RumblePak, MemoryExpansion};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = r.x($values);
        }

        private b(String str, int i2) {
        }

        public static fc.a getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* renamed from: of.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class C0020c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10985a;

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
            f10985a = iArr;
        }
    }

    public c(b bVar, String str, String str2) {
        bVar.getClass();
        this.f10982a = bVar;
        this.f10983b = str;
        this.f10984c = str2;
    }

    public final a.a a() {
        Uri uri;
        int i2 = C0020c.f10985a[this.f10982a.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        return af.c.f714b;
                    }
                    o.o();
                    return null;
                }
                return e.f716b;
            }
            String str = this.f10983b;
            Uri uri2 = null;
            if (str != null) {
                uri = Uri.parse(str);
            } else {
                uri = null;
            }
            String str2 = this.f10984c;
            if (str2 != null) {
                uri2 = Uri.parse(str2);
            }
            return new af.b(uri, uri2);
        }
        return d.f715b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f10982a == cVar.f10982a && k.a(this.f10983b, cVar.f10983b) && k.a(this.f10984c, cVar.f10984c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f10982a.hashCode() * 31;
        String str = this.f10983b;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        String str2 = this.f10984c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i10 + i2;
    }

    public final String toString() {
        b bVar = this.f10982a;
        String str = this.f10983b;
        String str2 = this.f10984c;
        StringBuilder sb2 = new StringBuilder("RomGbaSlotConfigDto(type=");
        sb2.append(bVar);
        sb2.append(", gbaRomPath=");
        sb2.append(str);
        sb2.append(", gbaSavePath=");
        return w.d.s(sb2, str2, ")");
    }
}
