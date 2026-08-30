package na;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public int f10248a;

    /* renamed from: b  reason: collision with root package name */
    public d f10249b;

    /* renamed from: c  reason: collision with root package name */
    public int[][] f10250c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    public d[] f10251d = new d[10];

    public static z b(d dVar) {
        z zVar = new z();
        zVar.a(StateSet.WILD_CARD, dVar);
        return zVar;
    }

    public final void a(int[] iArr, d dVar) {
        int i2 = this.f10248a;
        if (i2 == 0 || iArr.length == 0) {
            this.f10249b = dVar;
        }
        int[][] iArr2 = this.f10250c;
        if (i2 >= iArr2.length) {
            int i10 = i2 + 10;
            int[][] iArr3 = new int[i10];
            System.arraycopy(iArr2, 0, iArr3, 0, i2);
            this.f10250c = iArr3;
            d[] dVarArr = new d[i10];
            System.arraycopy(this.f10251d, 0, dVarArr, 0, i2);
            this.f10251d = dVarArr;
        }
        int[][] iArr4 = this.f10250c;
        int i11 = this.f10248a;
        iArr4[i11] = iArr;
        this.f10251d[i11] = dVar;
        this.f10248a = i11 + 1;
    }

    public final d c(int[] iArr) {
        int i2;
        int[][] iArr2 = this.f10250c;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i2 = -1;
            if (i11 < this.f10248a) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f10250c;
            while (true) {
                if (i10 >= this.f10248a) {
                    break;
                } else if (StateSet.stateSetMatches(iArr4[i10], iArr3)) {
                    i2 = i10;
                    break;
                } else {
                    i10++;
                }
            }
            i11 = i2;
        }
        if (i11 < 0) {
            return this.f10249b;
        }
        return this.f10251d[i11];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        int[] iArr = t9.a.f13173y;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        d c4 = n.c(obtainStyledAttributes, 5, new a(0.0f));
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i2 = 0;
                        for (int i10 = 0; i10 < attributeCount; i10++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                            if (attributeNameResource != R.attr.cornerSize) {
                                int i11 = i2 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i2] = attributeNameResource;
                                i2 = i11;
                            }
                        }
                        a(StateSet.trimStateSet(iArr2, i2), c4);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
