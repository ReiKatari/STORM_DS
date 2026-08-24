package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kt1  reason: default package */
/* loaded from: classes.dex */
public final class kt1 extends jw2 {
    public final TextView F;
    public final et1 G;
    public boolean H = true;

    public kt1(TextView textView) {
        this.F = textView;
        this.G = new et1(textView);
    }

    @Override // defpackage.jw2
    public final void A(boolean z) {
        if (z) {
            TextView textView = this.F;
            textView.setTransformationMethod(I(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.jw2
    public final void B(boolean z) {
        this.H = z;
        TextView textView = this.F;
        textView.setTransformationMethod(I(textView.getTransformationMethod()));
        textView.setFilters(s(textView.getFilters()));
    }

    @Override // defpackage.jw2
    public final TransformationMethod I(TransformationMethod transformationMethod) {
        if (this.H) {
            if (transformationMethod instanceof ot1) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new ot1(transformationMethod);
        } else if (transformationMethod instanceof ot1) {
            return ((ot1) transformationMethod).A;
        } else {
            return transformationMethod;
        }
    }

    @Override // defpackage.jw2
    public final InputFilter[] s(InputFilter[] inputFilterArr) {
        if (!this.H) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof et1) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            et1 et1Var = this.G;
            if (i4 < length2) {
                if (inputFilterArr[i4] == et1Var) {
                    return inputFilterArr;
                }
                i4++;
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = et1Var;
                return inputFilterArr3;
            }
        }
    }

    @Override // defpackage.jw2
    public final boolean u() {
        return this.H;
    }
}
