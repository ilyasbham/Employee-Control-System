import React from 'react'
import  {useNavigate} from 'react-router-dom'
const EmployeeList = () => {
    const navigate = useNavigate();
  return (
    <div className="container mx-auto my-8">
<div>
 <button 
  onClick={()=> navigate("/AddEmployee")}
 
 className="bg-slate-600 hover:bg-blue-600  my-12 px-20 py-2 rounded">Add Employee 🙎‍♂️</button> 
</div>
<table className="shadow">
  <thead  className="bg-slate-600">
<th className="px-6 py-3 uppercase tracking-wide"> Name </th>
<th className="px-6 py-3 uppercase tracking-wide"> Phone </th>
<th className="px-6 py-3 uppercase tracking-wide"> Email </th>
<th className="px-6 py-3 uppercase tracking-wide"> Action </th>

  </thead>
  <tbody>
    <tr className="hover:bg-white hover:text-black">
    <td className="text-left px-6 py-4">zkkl</td>
<td className="text-left px-6 py-4">1234</td>
<td className="text-left px-6 py-4">zkkl@gmail.com</td>
<td className="text-left px-6 py-4">
  <a href="/">Edit📑 </a>
  <a href="/">Delete 🗑</a>
</td>

</tr>

<tr className="hover:bg-white hover:text-black">
<td className="text-left px-6 py-4">zkkl</td>
<td className="text-left px-6 py-4">1234</td>
<td className="text-left px-6 py-4">zkkl@gmail.com</td>
<td className="text-left px-6 py-4">
    <a href="/">Edit📑 </a>
  <a href="/">Delete 🗑</a>
</td>

</tr>
  </tbody>
</table>
</div>
  )
}

export default EmployeeList