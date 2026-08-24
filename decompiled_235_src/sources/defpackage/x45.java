package defpackage;

import java.util.Iterator;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x45  reason: default package */
/* loaded from: classes.dex */
public final class x45 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ x45[] $VALUES;
    public static final w45 Companion;
    private static final x45[] entryArray;
    private final int typeId;
    public static final x45 INVALID = new x45("INVALID", 0, -1);
    public static final x45 VARINT = new x45("VARINT", 1, 0);
    public static final x45 i64 = new x45("i64", 2, 1);
    public static final x45 SIZE_DELIMITED = new x45("SIZE_DELIMITED", 3, 2);
    public static final x45 i32 = new x45("i32", 4, 5);

    private static final /* synthetic */ x45[] $values() {
        return new x45[]{INVALID, VARINT, i64, SIZE_DELIMITED, i32};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [w45, java.lang.Object] */
    static {
        Object obj;
        x45[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
        x45[] x45VarArr = new x45[8];
        for (int i = 0; i < 8; i++) {
            Iterator<E> it = getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((x45) obj).typeId == i) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            x45 x45Var = (x45) obj;
            if (x45Var == null) {
                x45Var = INVALID;
            }
            x45VarArr[i] = x45Var;
        }
        entryArray = x45VarArr;
    }

    private x45(String str, int i, int i2) {
        this.typeId = i2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static x45 valueOf(String str) {
        return (x45) Enum.valueOf(x45.class, str);
    }

    public static x45[] values() {
        return (x45[]) $VALUES.clone();
    }

    public final int getTypeId() {
        return this.typeId;
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append('(');
        return xg6.q(sb, this.typeId, ')');
    }

    public final int wireIntWithTag(int i) {
        return this.typeId | (i << 3);
    }
}
