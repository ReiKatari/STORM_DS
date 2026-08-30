package defpackage;

import java.util.Iterator;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qv4  reason: default package */
/* loaded from: classes.dex */
public final class qv4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ qv4[] $VALUES;
    public static final pv4 Companion;
    private static final qv4[] entryArray;
    private final int typeId;
    public static final qv4 INVALID = new qv4("INVALID", 0, -1);
    public static final qv4 VARINT = new qv4("VARINT", 1, 0);
    public static final qv4 i64 = new qv4("i64", 2, 1);
    public static final qv4 SIZE_DELIMITED = new qv4("SIZE_DELIMITED", 3, 2);
    public static final qv4 i32 = new qv4("i32", 4, 5);

    private static final /* synthetic */ qv4[] $values() {
        return new qv4[]{INVALID, VARINT, i64, SIZE_DELIMITED, i32};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, pv4] */
    static {
        Object obj;
        qv4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
        qv4[] qv4VarArr = new qv4[8];
        for (int i = 0; i < 8; i++) {
            Iterator<E> it = getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((qv4) obj).typeId == i) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            qv4 qv4Var = (qv4) obj;
            if (qv4Var == null) {
                qv4Var = INVALID;
            }
            qv4VarArr[i] = qv4Var;
        }
        entryArray = qv4VarArr;
    }

    private qv4(String str, int i, int i2) {
        this.typeId = i2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static qv4 valueOf(String str) {
        return (qv4) Enum.valueOf(qv4.class, str);
    }

    public static qv4[] values() {
        return (qv4[]) $VALUES.clone();
    }

    public final int getTypeId() {
        return this.typeId;
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append('(');
        return ej6.g(sb, this.typeId, ')');
    }

    public final int wireIntWithTag(int i) {
        return this.typeId | (i << 3);
    }
}
