package defpackage;

import java.util.RandomAccess;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ku  reason: default package */
/* loaded from: classes.dex */
public final class ku extends y0 implements RandomAccess {
    public final /* synthetic */ int[] A;

    public ku(int[] iArr) {
        this.A = iArr;
    }

    @Override // defpackage.k0
    public final int b() {
        return this.A.length;
    }

    @Override // defpackage.k0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return nu.Y(this.A, ((Number) obj).intValue());
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.A[i]);
    }

    @Override // defpackage.y0, java.util.List
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

    @Override // defpackage.k0, java.util.Collection
    public final boolean isEmpty() {
        if (this.A.length == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.y0, java.util.List
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
