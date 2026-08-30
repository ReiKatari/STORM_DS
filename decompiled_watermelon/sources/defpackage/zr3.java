package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zr3  reason: default package */
/* loaded from: classes.dex */
public abstract class zr3 {
    public static final zr3 DEFAULT = new a("DEFAULT", 0);
    public static final zr3 STRING = new zr3("STRING", 1) { // from class: zr3.b
        @Override // defpackage.zr3
        public l73 serialize(Long l) {
            if (l == null) {
                return c83.A;
            }
            return new l83(l.toString());
        }

        @Override // defpackage.zr3
        public dz6 typeAdapter() {
            return k07.l;
        }
    };
    private static final /* synthetic */ zr3[] $VALUES = $values();

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: zr3$a */
    /* loaded from: classes.dex */
    public enum a extends zr3 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // defpackage.zr3
        public l73 serialize(Long l) {
            if (l == null) {
                return c83.A;
            }
            return new l83(l);
        }

        @Override // defpackage.zr3
        public dz6 typeAdapter() {
            return k07.k;
        }
    }

    private static /* synthetic */ zr3[] $values() {
        return new zr3[]{DEFAULT, STRING};
    }

    private zr3(String str, int i) {
    }

    public static zr3 valueOf(String str) {
        return (zr3) Enum.valueOf(zr3.class, str);
    }

    public static zr3[] values() {
        return (zr3[]) $VALUES.clone();
    }

    public abstract l73 serialize(Long l);

    public abstract dz6 typeAdapter();

    public /* synthetic */ zr3(String str, int i, a aVar) {
        this(str, i);
    }
}
