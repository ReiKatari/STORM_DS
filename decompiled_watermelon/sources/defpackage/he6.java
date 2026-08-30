package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: he6  reason: default package */
/* loaded from: classes.dex */
public final class he6 {
    public int a;
    public y21 b;
    public int[][] c = new int[10];
    public y21[] d = new y21[10];

    public static he6 b(y21 y21Var) {
        he6 he6Var = new he6();
        he6Var.a(StateSet.WILD_CARD, y21Var);
        return he6Var;
    }

    public final void a(int[] iArr, y21 y21Var) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = y21Var;
        }
        int[][] iArr2 = this.c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.c = iArr3;
            y21[] y21VarArr = new y21[i2];
            System.arraycopy(this.d, 0, y21VarArr, 0, i);
            this.d = y21VarArr;
        }
        int[][] iArr4 = this.c;
        int i3 = this.a;
        iArr4[i3] = iArr;
        this.d[i3] = y21Var;
        this.a = i3 + 1;
    }

    public final y21 c(int[] iArr) {
        int i;
        int[][] iArr2 = this.c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 < this.a) {
                if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.c;
            while (true) {
                if (i2 >= this.a) {
                    break;
                } else if (StateSet.stateSetMatches(iArr4[i2], iArr3)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            i3 = i;
        }
        if (i3 < 0) {
            return this.b;
        }
        return this.d[i3];
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
                        int[] iArr = ay4.y;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        y21 c = a36.c(obtainStyledAttributes, 5, new s(RecyclerView.A1));
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i = 0;
                        for (int i2 = 0; i2 < attributeCount; i2++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                            if (attributeNameResource != R.attr.cornerSize) {
                                int i3 = i + 1;
                                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i] = attributeNameResource;
                                i = i3;
                            }
                        }
                        a(StateSet.trimStateSet(iArr2, i), c);
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
