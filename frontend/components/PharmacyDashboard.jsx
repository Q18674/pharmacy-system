import { Card, CardContent } from "@/components/ui/card";
import { Button } from "@/components/ui/button";
import { useEffect, useState } from "react";

export default function PharmacyDashboard() {
  const [medicines, setMedicines] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/medicines")
      .then(res => res.json())
      .then(data => setMedicines(data));
  }, []);

  return (
    <div className="p-4 grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4">
      {medicines.map(med => (
        <Card key={med.id}>
          <CardContent className="p-4">
            <h2 className="text-xl font-bold mb-2">{med.name}</h2>
            <p>库存数量: {med.stock}</p>
            <p>价格: ¥{med.price}</p>
            <Button className="mt-2">编辑</Button>
          </CardContent>
        </Card>
      ))}
    </div>
  );
}
