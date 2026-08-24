package defpackage;

import java.util.RandomAccess;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cv  reason: default package */
/* loaded from: classes.dex */
public final class cv extends z0 implements RandomAccess {
    public final /* synthetic */ int[] A;

    public cv(int[] iArr) {
        this.A = iArr;
    }

    @Override // defpackage.l0
    public final int a() {
        return this.A.length;
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return fv.m0(this.A, ((Number) obj).intValue());
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.A[i]);
    }

    @Override // defpackage.z0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.A;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (intValue == iArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.A.length == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.z0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Number) obj).intValue();
            int[] iArr = this.A;
            int length = iArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (intValue == iArr[length]) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        }
        return -1;
    }
}
